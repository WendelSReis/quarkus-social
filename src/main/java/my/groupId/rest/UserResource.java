package my.groupId.rest;

import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;
import my.groupId.rest.dto.CreateUserRequest;

@Path("/users")
public class UserResource {

    public Response createUser(CreateUserRequest userRequest) {
        return Response.ok().build();

    }
}
