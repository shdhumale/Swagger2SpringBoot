/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.21).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.Employee;
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

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2021-07-14T18:06:47.286+05:30")

@Validated
@Api(value = "getEmployee", description = "the getEmployee API")
@RequestMapping(value = "")
public interface GetEmployeeApi {

    @ApiOperation(value = "To get the employee", nickname = "getEmployeeUsingGET", notes = "", response = Employee.class, tags={ "index-controller", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Employee.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/getEmployee",
        produces = { "*/*" }, 
        method = RequestMethod.GET)
    ResponseEntity<Employee> getEmployeeUsingGET();

}
