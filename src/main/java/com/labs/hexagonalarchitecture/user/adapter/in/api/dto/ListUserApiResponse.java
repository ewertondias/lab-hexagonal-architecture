package com.labs.hexagonalarchitecture.user.adapter.in.api.dto;

import java.util.List;

public record ListUserApiResponse(
    List<UserApiResponse> users,
    int total) {
}
