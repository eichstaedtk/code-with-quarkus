package org.eichstaedt.finance;

import java.net.URI;
import java.net.URISyntaxException;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Created by konrad.eichstaedt@gmx.de on 11.07.22.
 */

@Path("/finance/outcome")
public class OutcomeController {

  @POST
  @Consumes(MediaType.APPLICATION_JSON)
  public Response createOutcome(Outcome outcome) throws URISyntaxException {
    return Response.created(new URI("/finance/outcome/"+outcome.getId())).build();
  }

}
