package com.matbena.auto_portfolio.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Portfolio {

    @EmbeddedId
    private PortfolioId id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    @MapsId("userId")
    private User user;

    @ManyToOne
    @JoinColumn(name = "asset_id")
    @MapsId("assetId")
    private Asset asset;

    private Double percentage;
}
