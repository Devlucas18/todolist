package br.com.lucasaraujo.todolist.task;

import java.time.LocalDateTime;

import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity(name = "tb_tasks")
public class TaskModel{
	
	@Id
	@GeneratedValue(generator = "UUID")
	private UUID id;
	private String description;
	
	@Column(length = 50)
	private String title;
	private String priority;
	private LocalDateTime startAt;
	private LocalDateTime endAt;
	private UUID idUser;
	
	
	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getPriority() {
		return priority;
	}


	public void setPriority(String priority) {
		this.priority = priority;
	}


	public LocalDateTime getStartAt() {
		return startAt;
	}


	public void setStartAt(LocalDateTime startAt) {
		this.startAt = startAt;
	}


	public LocalDateTime getEndAt() {
		return endAt;
	}


	public void setEndAt(LocalDateTime endAt) {
		this.endAt = endAt;
	}


	public UUID getIdUser() {
		return idUser;
	}


	public void setIdUser(UUID idUser) {
		this.idUser = idUser;
	}


	@CreationTimestamp
	private LocalDateTime createdAt;
	
	public void setId(UUID id) {
		this.id = id;
	}
	public UUID getId() {
		return id;
	}



	

	
	
}