/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.18).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package com.myorg.petservice.api;

import com.myorg.petservice.models.ErrorResponse;
import com.myorg.petservice.models.Pet;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.bind.annotation.CookieValue;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-01-18T08:17:04.078354-06:00[America/Chicago]")
@Api(value = "pets", description = "the pets API")
public interface PetsApi {

    @ApiOperation(value = "add pet", nickname = "addPet", notes = "", response = String.class, authorizations = {
        @Authorization(value = "OAuth", scopes = { 
            @AuthorizationScope(scope = "App_Read", description = ""),
            @AuthorizationScope(scope = "App_Admin", description = "")
            })    }, tags={ "Pet", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "200 OK", response = String.class) })
    @RequestMapping(value = "/pets",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<String> addPet(@ApiParam(value = "The pet details"  )  @Valid @RequestBody Pet body
);


    @ApiOperation(value = "List all pets.", nickname = "listPets", notes = "", response = Pet.class, responseContainer = "List", authorizations = {
        @Authorization(value = "OAuth", scopes = { 
            @AuthorizationScope(scope = "App_Read", description = ""),
            @AuthorizationScope(scope = "App_Admin", description = "")
            })    }, tags={ "Pet", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "200 OK", response = Pet.class, responseContainer = "List"),
        @ApiResponse(code = 200, message = "Any response other than 200 OK is an error", response = ErrorResponse.class) })
    @RequestMapping(value = "/pets",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<Pet>> listPets();

}
