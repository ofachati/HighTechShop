package resource;

import javax.ws.rs.*;
import javax.ws.rs.core.*;

import dao.UserDao;
import model.User;

@Path("/users")
@Produces(MediaType.APPLICATION_JSON)
public class UserResource {

    private UserDao userDao = UserDao.instance;

    // CREATE operation
    @POST
    public Response createUser(User user) {
        User createdUser = userDao.create(user);
        return Response.status(Response.Status.CREATED).entity(createdUser).build();
    }

    // READ operation
    @GET
    public Response getAllUsers() {
        return Response.ok(userDao.getAll()).build();
    }

    // READ operation
    @GET
    @Path("/{id}")
    public Response getUserById(@PathParam("id") int id) {
        User user = userDao.getById(id);
        if (user == null) {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
        return Response.ok(user).build();
    }

    // UPDATE operation
    @PUT
    @Path("/{id}")
    public Response updateUser(@PathParam("id") int id, User user) {
        user.setId(id);
        User updatedUser = userDao.update(user);
        if (updatedUser == null) {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
        return Response.ok(updatedUser).build();
    }

    // DELETE operation
    @DELETE
    @Path("/{id}")
    public Response deleteUser(@PathParam("id") int id) {
        userDao.delete(id);
        return Response.noContent().build();
    }
    
    
    @GET
    @Path("{id}/isAdmin")
    @Produces(MediaType.APPLICATION_JSON)
    public Response isAdmin(@PathParam("id") int id) {
        boolean isAdmin = UserDao.instance.isAdmin(id);
        return Response.ok(isAdmin).build();
    }

    
    @GET
    @Path("/getUserByCredentials")
    public Response getUserByCredentials(@QueryParam("username") String username, @QueryParam("password") String password) {
        User user = userDao.getUserByCredentials(username, password);
        if (user == null) {
            return Response.status(Response.Status.UNAUTHORIZED).build();
        } else {
            return Response.ok(user).build();
        }
    }


}
