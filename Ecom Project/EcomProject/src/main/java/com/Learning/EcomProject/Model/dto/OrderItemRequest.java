package com.Learning.EcomProject.Model.dto;

public record OrderItemRequest(
        int productId,
        int quantity
) {

}
