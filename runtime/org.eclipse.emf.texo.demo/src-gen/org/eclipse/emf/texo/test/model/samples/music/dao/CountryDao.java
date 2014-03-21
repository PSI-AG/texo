package org.eclipse.emf.texo.test.model.samples.music.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.samples.music.Country;
import org.eclipse.emf.texo.test.model.samples.music.MusicModelPackage;

/**
 * The Dao implementation for the model object '<em><b>Country</b></em>'.
 * 
 * @generated
 */
public class CountryDao extends BaseDao<Country> {

	/**
	 * @generated
	 */
	@Override
	public Class<Country> getEntityClass() {
		return Country.class;
	}

	/**
	 * @generated
	 */
	@Override
	public EClass getEClass() {
		return MusicModelPackage.INSTANCE.getCountryEClass();
	}
}
