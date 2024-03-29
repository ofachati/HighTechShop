package resource;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import dao.ArticleDao;
import model.Article;

import javax.ws.rs.core.Response;



@Path("/articles")
public class ArticleResource {
	
	private ArticleDao articleDao = ArticleDao.instance;
	
	@GET
	@Produces(MediaType.APPLICATION_JSON )
	public List<Article> getArticles() {
		return articleDao.getArticles();
	}

	
	@GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Article getArticle(@PathParam("id") int id) {
		Article article = ArticleDao.instance.getArticleById(id);
        if (article == null) {
            throw new NotFoundException("article not found");
        }
        return article;
    }
	
	
	@GET
	@Path("/category/{category}")
	@Produces(MediaType.APPLICATION_JSON )
	public List<Article> getArticlesByCategory(@PathParam("category") String category) {
		return articleDao.getArticlesByCategory(category);
	}
	
	// Old implementation (it works but i found a better way) 
	/*
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public Article addArticle(
	    @FormParam("libelle") String libelle,
	    @FormParam("description") String description,
	    @FormParam("marque") String marque,
	    @FormParam("prix") double prix,
	    @FormParam("categorie") String categorie,
	    @FormParam("photo") String photo) {
	  try {
		  System.out.print("ffffff");
	    return articleDao.addArticle(libelle,  description,  marque,  prix,  categorie, photo);
	  } catch (Exception e) {
	    ResponseBuilder builder = Response.status(Status.INTERNAL_SERVER_ERROR);
	    builder.entity("An error occurred while adding the article: " + e.getMessage());
	    throw new WebApplicationException(builder.build());
	  }
	}
	*/
	
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response addArticle(Article article) {
		System.out.println("adding article");
		System.out.println(article);
		Article addedArticle = ArticleDao.instance.addArticle(article);
        return Response.status(Response.Status.CREATED).entity(addedArticle).build();
    }
	
	
	@PUT
	@Produces(MediaType.APPLICATION_JSON)
	public void updateArticle(Article article) {
		
		  System.out.println("-Updating product:");
		  System.out.println(article);
		  
		articleDao.updateArticle(article);
	}
	
	@DELETE
	@Path("{id}")
	public Response deleteArticle(@PathParam("id") int id) {
		  System.out.print("-Deleting product");

		try {
	        articleDao.deleteArticle(id);
	        return Response.status(Response.Status.OK).build();
	    } catch (Exception e) {
	        return Response.status(Response.Status.BAD_REQUEST).entity(e.getMessage()).build();
	    }
	}
}
