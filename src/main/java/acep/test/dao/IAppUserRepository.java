package acep.test.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import acep.test.entities.AppUserEntity;

public interface IAppUserRepository extends JpaRepository<AppUserEntity, Integer> {
   AppUserEntity finByEmail(String email);
}
