package com.HrQuickView.model;

import com.HrQuickView.common.enums.FileCategory;
import com.HrQuickView.model.baseModal.BaseEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;
@Setter
@Getter
@ToString
@Table(name = "s3_file_metadata")
@Entity
public class S3FileMetadata extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "file_id")
    private Long fileId;

    @Enumerated(EnumType.STRING)
    private FileCategory fileCategory;

    @Column(name = "bucket_name")
    private String bucketName;

    private String fileName;

    private String originalFileName;

    private String path;

    private String fileUrl;

    @Column(name = "file_size")
    private long fileSize;

    @Column(name = "content_type")
    private String contentType;

    @Column(name = "last_modified")
    private Date lastModified;

    private String etag;

    @Column(name = "company_id")
    private Long companyId;


    public S3FileMetadata() {
    }


}
