package com.matbena.auto_portfolio.model;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Entity
public class Asset {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;

    @Column(unique = true)
    private String symbol;

    @UpdateTimestamp
    private LocalDateTime updateDateTime;

    //It may not be necessary to store the value of the asset because we will fetch its value
    private BigDecimal price;

    @ManyToOne
    @JoinColumn(name = "asset_type")
    private AssetType assetType;
}
