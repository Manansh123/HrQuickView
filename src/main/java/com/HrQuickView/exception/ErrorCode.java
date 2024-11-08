package com.HrQuickView.exception;

public class ErrorCode {
    // Common error codes
    public static final String INTERNAL_SERVER_ERROR = "INTERNAL_SERVER_ERROR";
    public static final String BAD_REQUEST = "BAD_REQUEST";
    public static final String NOT_FOUND = "NOT_FOUND";

    // Custom error codes specific to your application
    public static final String EXISTING_PACKAGE_NOT_AVAILABLE = "EXISTING_PACKAGE_NOT_AVAILABLE";
    public static final String EXISTING_PACKAGE_ALREADY_PRESENT = "EXISTING_PACKAGE_ALREADY_PRESENT";
    public static final String SUPERADMIN_ACCESS_REQUIRED = "SUPER ADMIN_ACCESS_REQUIRED";

    public static final String INVALID_JWT_TOKEN = "INVALID_JWT_TOKEN";
    public static final String EXPIRED_JWT_TOKEN = "EXPIRED_JWT_TOKEN";
    public static final String UNSUPPORTED_JWT_TOKEN = "UNSUPPORTED_JWT_TOKEN";
    public static final String JWT_CLAIMS_STRING_IS_EMPTY = "JWT_CLAIMS_STRING_IS_EMPTY";
    public static final String INTERNAL_SERVER_ERROR_WHILE_UPDATING_PACKAGE = "INTERNAL_SERVER_ERROR_WHILE_UPDATING_PACKAGE";
    public static final String INTERNAL_SERVER_ERROR_WHILE_ADDING_PACKAGE = "INTERNAL_SERVER_ERROR_WHILE_ADDING_PACKAGE";
    public static final String INTERNAL_SERVER_ERROR_WHILE_FETCHING_PACKAGES = "INTERNAL_SERVER_ERROR_WHILE_FETCHING_PACKAGES";
    public static final String NO_PACKAGES_FOUND = "NO_PACKAGES_FOUND";
    public static final String COMPANY_NOT_FOUND_WHILE_ADDING_NEW_USER = "COMPANY_NOT_FOUND_WHILE_ADDING_NEW_USER";
    public static final String SUBSCRIPTION_NOT_FOUND_WHILE_ADDING_NEW_USER = "SUBSCRIPTION_NOT_FOUND_WHILE_ADDING_NEW_USER";
    public static final String PACKAGE_NOT_FOUND_WHILE_ADDING_NEW_USER = "PACKAGE_NOT_FOUND_WHILE_ADDING_NEW_USER";
    public static final String LIMIT_EXCEEDED_WHILE_ADDING_NEW_USER = "LIMIT_EXCEEDED_WHILE_ADDING_NEW_USER";
    public static final String INTERNAL_SERVER_ERROR_WHILE_ADDING_USER = "INTERNAL_SERVER_ERROR_WHILE_ADDING_USER";
    public static final String USER_NOT_FOUND = "USER_NOT_FOUND";
    public static final String INTERNAL_SERVER_ERROR_WHILE_FETCHING_USER = "INTERNAL_SERVER_ERROR_WHILE_FETCHING_USER";
    public static final String INSUFFICIENT_PRIVILEGES_WHILE_DEACTIVATING_USER = "INSUFFICIENT_PRIVILEGES_WHILE_DEACTIVATING_USER";
    public static final String INTERNAL_SERVER_ERROR_WHILE_DEACTIVATING_USER = "INTERNAL_SERVER_ERROR_WHILE_DEACTIVATING_USER";
    public static final String COMPANY_ALREADY_EXISTS = "COMPANY_ALREADY_EXISTS";
    public static final String USER_ALREADY_EXISTS = "USER_ALREADY_EXISTS";
    public static final String INTERNAL_SERVER_ERROR_WHILE_SAVING_COMPANY = "INTERNAL_SERVER_ERROR_WHILE_SAVING_COMPANY";
    public static final String INTERNAL_SERVER_ERROR_WHILE_FETCHING_COMPANIES = "INTERNAL_SERVER_ERROR_WHILE_FETCHING_COMPANIES";
    public static final String ACCESS_DENIED_FOR_CREATING_TERMS_CONDITIONS = "ACCESS_DENIED_FOR_CREATING_TERMS_CONDITIONS";
    public static final String INTERNAL_SERVER_ERROR_WHILE_UPSERTING_TERMS_CONDITIONS = "INTERNAL_SERVER_ERROR_WHILE_UPSERTING_TERMS_CONDITIONS";
    public static final String ACCESS_DENIED_WHILE_UPSERTING_PRIVACY_POLICY = "ACCESS_DENIED_WHILE_UPSERTING_PRIVACY_POLICY";
    public static final String INTERNAL_SERVER_ERROR_WHILE_UPSERTING_PRIVACY_POLICY = "INTERNAL_SERVER_ERROR_WHILE_UPSERTING_PRIVACY_POLICY";
    public static final String NO_DATA_FOUND_FOR_TERMS_CONDITIONS = "NO_DATA_FOUND_FOR_TERMS_CONDITIONS";
    public static final String NO_DATA_FOUND_FOR_PRIVACY_POLICY = "NO_DATA_FOUND_FOR_PRIVACY_POLICY";
    public static final String INTERNAL_SERVER_ERROR_WHILE_FETCHING_TERMS ="INTERNAL_SERVER_ERROR_WHILE_FETCHING_TERMS" ;
    public static final String INTERNAL_SERVER_ERROR_WHILE_FETCHING_PRIVACY_POLICY ="INTERNAL_SERVER_ERROR_WHILE_FETCHING_PRIVACY_POLICY" ;
    public static final String INTERNAL_SERVER_ERROR_WHILE_ADDING_PROJECT_DETAILS ="INTERNAL_SERVER_ERROR_WHILE_ADDING_PROJECT_DETAILS" ;
    public static final String LIMIT_EXCEEDED_WHILE_ADDING_PROJECT_DETAILS = "LIMIT_EXCEEDED_WHILE_ADDING_PROJECT_DETAILS";
    public static final String PROJECT_NAME_ALREADY_EXISTS = "PROJECT_NAME_ALREADY_EXISTS"  ;
    public static final String NO_PROJECTS_FOUND = "NO_PROJECTS_FOUND";
    public static final String INTERNAL_SERVER_ERROR_WHILE_FETCHING_PROJECTS = "INTERNAL_SERVER_ERROR_WHILE_FETCHING_PROJECTS";
    public static final String INTERNAL_SERVER_ERROR_WHILE_UPDATING_PROJECT_DETAILS = "INTERNAL_SERVER_ERROR_WHILE_UPDATING_PROJECT_DETAILS";
    public static final String INTERNAL_SERVER_ERROR_WHILE_UPLOADING_FILE = "INTERNAL_SERVER_ERROR_WHILE_UPLOADING_FILE";
    public static final String LIMIT_EXCEEDED_WHILE_UPLOADING_FILE = "LIMIT_EXCEEDED_WHILE_UPLOADING_FILE";
    public static final String USER_NOT_ASSOCIATED_WITH_COMPANY_WHILE_UPLOADING_FILE = "USER_NOT_ASSOCIATED_WITH_COMPANY_WHILE_UPLOADING_FILE";
    public static final String NO_COMPANY_FOUND_WHILE_FETCHING = "NO_COMPANY_FOUND_WHILE_FETCHING";
    public static final String INTERNAL_SERVER_ERROR_WHILE_FETCHING_PROJECT_DETAILS = "INTERNAL_SERVER_ERROR_WHILE_FETCHING_PROJECT_DETAILS";
    public static final String INTERNAL_SERVER_ERROR_WHILE_UPDATING_USER = "INTERNAL_SERVER_ERROR_WHILE_UPDATING_USER";
    public static final String USER_NOT_AUTHORIZED_TO_UPDATE = "USER_NOT_AUTHORIZED_TO_UPDATE";
    public static final String INTERNAL_SERVER_ERROR_WHILE_SENDING_EMAIL_LINK = "INTERNAL_SERVER_ERROR_WHILE_SENDING_EMAIL_LINK";
    public static final String INTERNAL_SERVER_ERROR_WHILE_CREATING_SUPPORT = "INTERNAL_SERVER_ERROR_WHILE_CREATING_SUPPORT";
    public static final String INTERNAL_SERVER_ERROR_WHILE_FETCHING_SUPPORT = "INTERNAL_SERVER_ERROR_WHILE_FETCHING_SUPPORT";
    public static final String NO_DATA_FOUND_FOR_SUPPORT = "NO_DATA_FOUND_FOR_SUPPORT";
    public static final String USER_NOT_ACTIVE = "USER_NOT_ACTIVE";
    public static final String NO_FILE_FOUND = "NO_FILE_FOUND";
    public static final String INTERNAL_SERVER_ERROR_WHILE_LOGGING_IN = "INTERNAL_SERVER_ERROR_WHILE_LOGGING_IN";
    public static final String TEMPLATE_NOT_AVAILABLE = "TEMPLATE_NOT_AVAILABLE";
    public static final String CONTENT_IS_NOT_PRESENT = "CONTENT_IS_NOT_PRESENT";
    public static final String LINK_EXPIRED = "LINK_EXPIRED";
    public static final String INVALID_TOKEN = "INVALID_TOKEN";
    public static final String INTERNAL_SERVER_ERROR_WHILE_UPLOADING_TERMS_AND_CONDITIONS = "INTERNAL_SERVER_ERROR_WHILE_UPLOADING_TERMS_AND_CONDITIONS";
    public static final String ACCESS_DENIED_FOR_UPLOADING_TERMS_AND_CONDITIONS = "ACCESS_DENIED_FOR_UPLOADING_TERMS_AND_CONDITIONS";
    public static final String INTERNAL_SERVER_ERROR_WHILE_UPLOADING_PRIVACY_POLICY = "INTERNAL_SERVER_ERROR_WHILE_UPLOADING_PRIVACY_POLICY";
    public static final String ACCESS_DENIED_FOR_UPLOADING_PRIVACY_POLICY = "ACCESS_DENIED_FOR_UPLOADING_PRIVACY_POLICY";
    public static final String FORBIDDEN_ACCESS = "FORBIDDEN_ACCESS";
    public static final String COMPANY_NOT_FOUND = "COMPANY_NOT_FOUND";
    public static final String INTERNAL_SERVER_ERROR_WHILE_UPDATING_COMPANY = "INTERNAL_SERVER_ERROR_WHILE_UPDATING_COMPANY";
    public static final String NO_RULES_FOUND = "NO_RULES_FOUND";
    public static final String ACCESS_DENIED_FOR_FETCHING_COMPANIES = "ACCESS_DENIED_FOR_FETCHING_COMPANIES";
    public static final String INTERNAL_SERVER_ERROR_WHILE_RESETTING_PASSWORD = "INTERNAL_SERVER_ERROR_WHILE_RESETTING_PASSWORD";
    public static final String EMAIL_ALREADY_SUBSCRIBED = "EMAIL_ALREADY_SUBSCRIBED";
    public static final String INTERNAL_SERVER_ERROR_WHILE_SUBSCRIBING = "INTERNAL_SERVER_ERROR_WHILE_SUBSCRIBING";
    public static final String INTERNAL_SERVER_ERROR_WHILE_UPLOADING_FILE_TO_AI = "INTERNAL_SERVER_ERROR_WHILE_UPLOADING_FILE_TO_AI";
    public static final String NO_TARGET_IN_OUTBOUND = "NO_TARGET_IN_OUTBOUND";
    public static final String RESOURCE_ACCESS_EXCEPTION = "RESOURCE_ACCESS_EXCEPTION";
    public static final String RESOURCE_CLIENT_EXCEPTION = "RESOURCE_CLIENT_EXCEPTION";
    public static final String UNSUPPORTED_BODY_TYPE = "UNSUPPORTED_BODY_TYPE";
    // Add more error codes as needed for your specific use cases
}
