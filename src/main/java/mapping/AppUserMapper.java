package mapping;

import org.mapstruct.Mapper;

import acep.test.dto.AppUser;
import acep.test.entities.AppUserEntity;

@Mapper
public interface AppUserMapper {
   AppUser toAppUser(AppUserEntity appUserEntity);
   AppUserEntity fromAppUser(AppUser appUser);
}
