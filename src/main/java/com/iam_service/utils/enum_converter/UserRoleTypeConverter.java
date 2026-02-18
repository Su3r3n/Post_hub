package com.iam_service.utils;

import com.iam_service.service.model.IamServiceUserRole;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter
public class UserRoleTypeConverter implements AttributeConverter<IamServiceUserRole, String> {


    @Override
    public String convertToDatabaseColumn(IamServiceUserRole iamServiceUserRole) {
        return IamServiceUserRole.name();
    }

    @Override
    public IamServiceUserRole convertToEntityAttribute(String s) {
        return IamServiceUserRole.fromName(s);
    }
}
