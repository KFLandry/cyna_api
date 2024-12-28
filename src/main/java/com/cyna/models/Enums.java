package com.cyna.models;

enum ROLE{
    ADMIN,
    CLIENT,
    GUEST,
}

enum ProductStatus {
    AVALIABLE,
    DISCONTINUED,
    OUT_OF_STOCK,
}

enum OrderStatus {
    PENDING,
    CONFIRMED,
    SHIPPED,
    DELIVERED,
    CANCELLED
}


enum PaymentMethod {
    CREDIT_CARD,
    PAYPAL
}

enum TicketPriority {
    LOW,
    MEDIUM,
    HIGHT
}

enum StatusPriority {
    OPEN,
    IN_PROGRESS,
    CLOSED
}