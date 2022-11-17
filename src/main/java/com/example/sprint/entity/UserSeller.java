package com.example.sprint.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class UserSeller {
    private List<UserBuyer> followers;
    private List<Post> posts;
}
