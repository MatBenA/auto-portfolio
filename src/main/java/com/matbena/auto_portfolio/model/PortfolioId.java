package com.matbena.auto_portfolio.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@Embeddable
public class PortfolioId implements Serializable {

    @Column(name = "user_id")
    private int userId;

    @Column(name = "asset_id")
    private int assetId;
}
