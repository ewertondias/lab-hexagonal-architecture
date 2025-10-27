package com.labs.hexagonalarchitecture.user.adapter.in.api.doc;

import com.labs.hexagonalarchitecture.user.adapter.in.api.dto.CreateUserRequest;
import com.labs.hexagonalarchitecture.user.adapter.in.api.dto.ListUserApiResponse;
import com.labs.hexagonalarchitecture.user.adapter.in.api.dto.UserApiResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;

@Tag(name = "User", description = "Management of user")
public interface UserApiDoc {

    @Operation(summary = "Create new user", method = "POST")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "201", description = "User created successfully"),
        @ApiResponse(responseCode = "400", description = "Bad request"),
        @ApiResponse(responseCode = "401", description = "Unauthorized"),
        @ApiResponse(responseCode = "500", description = "Internal server error")
    })
    ResponseEntity<UserApiResponse> create(CreateUserRequest request);

    @Operation(summary = "Find user by id", method = "GET")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "User returned successfully"),
        @ApiResponse(responseCode = "401", description = "Unauthorized"),
        @ApiResponse(responseCode = "404", description = "User not found"),
        @ApiResponse(responseCode = "500", description = "Internal server error")
    })
    ResponseEntity<UserApiResponse> findById(String id);

    @Operation(summary = "List all users", method = "GET")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Users listed successfully"),
        @ApiResponse(responseCode = "500", description = "Internal server error")
    })
    ResponseEntity<ListUserApiResponse> list();

}
