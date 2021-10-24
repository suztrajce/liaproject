package se.havochvatten.unionvms.ais.simulator;
import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/api")
@ApplicationScoped
@Produces(MediaType.TEXT_PLAIN)
public class simulatorApi {

    @GET
    public String test() {
        return "Testing testing!";
    }

}
