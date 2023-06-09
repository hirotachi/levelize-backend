package com.simplon.levelize.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CompanyDto implements Serializable {
    private String name;
    private String logo;
    private String url;
}
