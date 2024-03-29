package my.groupId.rest;

import my.groupId.domain.model.User;
import my.groupId.rest.dto.CreateUserRequest;

import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


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
