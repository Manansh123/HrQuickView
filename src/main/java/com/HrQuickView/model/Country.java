package com.HrQuickView.model;

import com.HrQuickView.model.baseModal.BaseEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name="country")
public class Country extends BaseEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(name = "country_id",unique = true)
    private long countryId;

    @Column(name = "code",unique = true)
    private String code;

    @Column(name = "name",unique = true)
    private String name;
    private boolean showInWebsite;

    private long phonecode;
}