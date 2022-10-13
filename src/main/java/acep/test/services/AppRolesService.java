package acep.test.services;

import org.springframework.stereotype.Service;

import acep.test.dao.IAppRolesRepository;
import mapping.AppRolesMapper;

@Service
public class AppRolesService {
  
	private IAppRolesRepository iAppRolesRepository;
	private AppRolesMapper appRolesMapper;

	public AppRolesService(IAppRolesRepository iAppRolesRepository, AppRolesMapper appRolesMapper) {
		super();
		this.iAppRolesRepository = iAppRolesRepository;
		this.appRolesMapper = appRolesMapper;
	}
	
	
}
