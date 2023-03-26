package resource;

import dao.CategorieDao;
import model.Categorie;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/categories")
public class CategorieResource {

    private final CategorieDao categorieDao = CategorieDao.instance;

    // Get all categories
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Categorie> getAllCategories() {
        return categorieDao.getAllCategories();
    }

    // Get a category by ID
    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getCategoryById(@PathParam("id") int id) {
        Categorie categorie = categorieDao.getCategoryById(id);
        if (categorie == null) {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
        return Response.ok(categorie).build();
    }

    // Get subcategories for a category by ID
    @GET
    @Path("/{id}/subcategories")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getSubcategoriesForCategory(@PathParam("id") int id) {
        List<Categorie> subcategories = categorieDao.getSubcategoriesForCategory(id);
        if (subcategories.isEmpty()) {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
        return Response.ok(subcategories).build();
    }
}
