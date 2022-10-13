package mapping;

import org.mapstruct.Mapper;

import acep.test.dto.AppRoles;
import acep.test.entities.AppRolesEntity;

@Mapper
public interface AppRolesMapper {
	   AppRoles toAppRoles(AppRolesEntity appRolesEntity);
	   AppRolesEntity fromAppRoles(AppRoles appRoles);
}
