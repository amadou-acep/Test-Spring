package acep.test.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import acep.test.entities.AppRolesEntity;

public interface IAppRolesRepository extends JpaRepository<AppRolesEntity, Integer> {

}
