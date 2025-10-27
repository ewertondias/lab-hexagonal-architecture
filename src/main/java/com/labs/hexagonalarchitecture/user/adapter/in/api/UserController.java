package com.labs.hexagonalarchitecture.user.adapter.in.api;

import com.labs.hexagonalarchitecture.user.adapter.in.api.assembler.UserApiAssembler;
import com.labs.hexagonalarchitecture.user.adapter.in.api.doc.UserApiDoc;
import com.labs.hexagonalarchitecture.user.adapter.in.api.dto.CreateUserRequest;
import com.labs.hexagonalarchitecture.user.adapter.in.api.dto.ListUserApiResponse;
import com.labs.hexagonalarchitecture.user.adapter.in.api.dto.UserApiResponse;
import com.labs.hexagonalarchitecture.user.application.usecase.CreateUserUseCase;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
@RequestMapping("/users")
public class UserController implements UserApiDoc {

    private final CreateUserUseCase createUser;

    public UserController(CreateUserUseCase createUser) {
        this.createUser = createUser;
    }

    @Override
    @PostMapping
    public ResponseEntity<UserApiResponse> create(@RequestBody @Valid CreateUserRequest request) {
        var command = UserApiAssembler.toCommand(request);
        var userCreated = createUser.execute(command);
        var userApiResponse = UserApiAssembler.toApiResponse(userCreated);

        var location = ServletUriComponentsBuilder.fromCurrentRequest()
            .path("/{id}")
            .buildAndExpand(userApiResponse.id())
            .toUri();

        return ResponseEntity.created(location)
            .body(userApiResponse);
    }

    @Override
    @GetMapping("/{id}")
    public ResponseEntity<UserApiResponse> findById(@PathVariable String id) {
        return null;
    }

    @Override
    @GetMapping
    public ResponseEntity<ListUserApiResponse> list() {
        return null;
    }

}
