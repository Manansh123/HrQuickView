package com.HrQuickView.common.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class PrivacyPolicyDto {
    private String status;
    private S3ResponseMetadataDto uploadFileMetadata;
}
