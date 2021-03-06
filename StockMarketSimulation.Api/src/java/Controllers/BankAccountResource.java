/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import DatabaseConnection.DB;
import Models.BankAccountViewModel;
import Repositories.BankAccountRepository;
import Repositories.StockTransactionRepository;
import java.sql.Connection;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * REST Web Service
 *
 * @author lakshan
 */
@Path("bankAccount")
public class BankAccountResource {
    
    @Context
    private UriInfo context;

    /**
     * Creates a new instance of BankResource
     */
    public BankAccountResource() {
    }

    /**
     * Retrieves representation of an instance of Controllers.BankResource
     *
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getJson() {
        try {

            BankAccountViewModel vm = new BankAccountViewModel();
            
            StockTransactionRepository r = new StockTransactionRepository();
            
            return Response.ok().build();
        } catch (Exception e) {
            return Response.serverError().build();
        }
    }
    
    @POST
    @Path("/GetHrMsg/json_data")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public void gethrmessage(BankAccountViewModel requestBody) {
        String a = "";
    }

    /**
     * PUT method for updating or creating an instance of BankResource
     *
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    }
}
