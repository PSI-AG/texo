package org.eclipse.emf.texo.test.model.samples.music;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * A representation of the model object '<em><b>Album</b></em>'. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class Album {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private long id = 0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private Long version = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private String name = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private Artist artist = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private Date releaseDate = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private List<Genre> genres = new ArrayList<Genre>();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private List<Song> songs = new ArrayList<Song>();

	/**
	 * Returns the value of '<em><b>id</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>id</b></em>' feature
	 * @generated
	 */
	public long getId() {
		return id;
	}

	/**
	 * Sets the '{@link Album#getId() <em>id</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param the
	 *            new value of the '{@link Album#getId() id}' feature.
	 * @generated
	 */
	public void setId(long newId) {
		id = newId;
	}

	/**
	 * Returns the value of '<em><b>version</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>version</b></em>' feature
	 * @generated
	 */
	public Long getVersion() {
		return version;
	}

	/**
	 * Sets the '{@link Album#getVersion() <em>version</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param the
	 *            new value of the '{@link Album#getVersion() version}' feature.
	 * @generated
	 */
	public void setVersion(Long newVersion) {
		version = newVersion;
	}

	/**
	 * Returns the value of '<em><b>name</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>name</b></em>' feature
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the '{@link Album#getName() <em>name</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param the
	 *            new value of the '{@link Album#getName() name}' feature.
	 * @generated
	 */
	public void setName(String newName) {
		name = newName;
	}

	/**
	 * Returns the value of '<em><b>artist</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>artist</b></em>' feature
	 * @generated
	 */
	public Artist getArtist() {
		return artist;
	}

	/**
	 * Sets the '{@link Album#getArtist() <em>artist</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param the
	 *            new value of the '{@link Album#getArtist() artist}' feature.
	 * @generated
	 */
	public void setArtist(Artist newArtist) {
		artist = newArtist;
	}

	/**
	 * Returns the value of '<em><b>releaseDate</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>releaseDate</b></em>' feature
	 * @generated
	 */
	public Date getReleaseDate() {
		return releaseDate;
	}

	/**
	 * Sets the '{@link Album#getReleaseDate() <em>releaseDate</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param the
	 *            new value of the '{@link Album#getReleaseDate() releaseDate}'
	 *            feature.
	 * @generated
	 */
	public void setReleaseDate(Date newReleaseDate) {
		releaseDate = newReleaseDate;
	}

	/**
	 * Returns the value of '<em><b>genres</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>genres</b></em>' feature
	 * @generated
	 */
	public List<Genre> getGenres() {
		return genres;
	}

	/**
	 * Adds to the <em>genres</em> feature.
	 * 
	 * @generated
	 */
	public void addToGenres(Genre genresValue) {
		if (!genres.contains(genresValue)) {
			genres.add(genresValue);
		}
	}

	/**
	 * Removes from the <em>genres</em> feature.
	 * 
	 * @generated
	 */
	public void removeFromGenres(Genre genresValue) {
		if (genres.contains(genresValue)) {
			genres.remove(genresValue);
		}
	}

	/**
	 * Clears the <em>genres</em> feature.
	 * 
	 * @generated
	 */
	public void clearGenres() {
		while (!genres.isEmpty()) {
			removeFromGenres(genres.iterator().next());
		}
	}

	/**
	 * Sets the '{@link Album#getGenres() <em>genres</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param the
	 *            new value of the '{@link Album#getGenres() genres}' feature.
	 * @generated
	 */
	public void setGenres(List<Genre> newGenres) {
		genres = newGenres;
	}

	/**
	 * Returns the value of '<em><b>songs</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>songs</b></em>' feature
	 * @generated
	 */
	public List<Song> getSongs() {
		return songs;
	}

	/**
	 * Adds to the <em>songs</em> feature.
	 * 
	 * @generated
	 */
	public void addToSongs(Song songsValue) {
		if (!songs.contains(songsValue)) {
			songs.add(songsValue);
		}
	}

	/**
	 * Removes from the <em>songs</em> feature.
	 * 
	 * @generated
	 */
	public void removeFromSongs(Song songsValue) {
		if (songs.contains(songsValue)) {
			songs.remove(songsValue);
		}
	}

	/**
	 * Clears the <em>songs</em> feature.
	 * 
	 * @generated
	 */
	public void clearSongs() {
		while (!songs.isEmpty()) {
			removeFromSongs(songs.iterator().next());
		}
	}

	/**
	 * Sets the '{@link Album#getSongs() <em>songs</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param the
	 *            new value of the '{@link Album#getSongs() songs}' feature.
	 * @generated
	 */
	public void setSongs(List<Song> newSongs) {
		songs = newSongs;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this
	 * instance. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		return "Album " + " [id: " + getId() + "]" + " [version: "
				+ getVersion() + "]" + " [name: " + getName() + "]"
				+ " [releaseDate: " + getReleaseDate() + "]";
	}
}
