package resource;

import dao.CommandeDao;
import model.Commande;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/commandes")
public class CommandeResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Commande> getAllCommandes() {
        return CommandeDao.instance.getAllCommandes();
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Commande getCommande(@PathParam("id") int id) {
        Commande commande = CommandeDao.instance.getCommande(id);
        if (commande == null) {
            throw new NotFoundException("Commande not found");
        }
        return commande;
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response addCommande(Commande commande) {
		System.out.println("adding document");
		System.out.println(commande);
        Commande addedCommande = CommandeDao.instance.addCommande(commande);
        return Response.status(Response.Status.CREATED).entity(addedCommande).build();
    }

    @PUT
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Commande updateCommande(@PathParam("id") int id, Commande commande) {
        Commande updatedCommande = CommandeDao.instance.updateCommande(id, commande);
        if (updatedCommande == null) {
            throw new NotFoundException("Commande not found");
        }
        return updatedCommande;
    }

    @DELETE
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Commande deleteCommande(@PathParam("id") int id) {
        Commande commande = CommandeDao.instance.deleteCommande(id);
        if (commande == null) {
            throw new NotFoundException("Commande not found");
        }
        return commande;
    }

    @GET
    @Path("/user/{userId}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Commande> getCommandesByUser(@PathParam("userId") int userId) {
        List<Commande> commandes = CommandeDao.instance.getCommandesByUser(userId);
        if (commandes.isEmpty()) {
            throw new NotFoundException("No commandes found for user");
        }
        return commandes;
    }

}
