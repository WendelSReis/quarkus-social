package my.groupId.rest;

import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import my.groupId.domain.model.User;
import my.groupId.rest.dto.CreateUserRequest;

import java.beans.Transient;

@Path("/users")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class UserResource {

    @POST
    @Transactional
    public Response createUser(CreateUserRequest userRequest) {

        User user = new User();
        user.setAge(userRequest.getAge());
        user.setName(userRequest.getName());

        user.persist();

        return Response.ok(user).build();
    }

    @GET
    public Response listAllUsers() {
        return Response.ok().build();
    }
}
