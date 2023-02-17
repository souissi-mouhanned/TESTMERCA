package Com.Merca.Mercarue.models;
import java.security.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data

@Entity
@Table
public class wor7428_smush_dir_images {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(columnDefinition = "mediumint(9) NOT NULL")

	private Integer  id;
	
	 @Column(columnDefinition = "CHAR(32) COLLATE utf8mb4_unicode_520_ci")
	 String path_hash  = null;
	 @Column(columnDefinition = "VARCHAR(55) COLLATE utf8mb4_unicode_520_ci")
	 String resize  = null;
	 @Column(columnDefinition = "VARCHAR(55) COLLATE utf8mb4_unicode_520_ci")
	 String lossy  = null;
	 @Column(columnDefinition = "VARCHAR(55) COLLATE utf8mb4_unicode_520_ci")
	 String error  = null;
	
	 @Column(columnDefinition = "TEXT COLLATE utf8mb4_unicode_520_ci") 	
	 String path = null;
	 
	 @Column( columnDefinition = "int(10) UNSIGNED DEFAULT NULL")
	    private Integer image_size;
	 
	 @Column( columnDefinition = "int(10) UNSIGNED DEFAULT NULL")
	    private Integer orig_size;
	 
	 @Column( columnDefinition = "int(10) UNSIGNED DEFAULT NULL")
	    private Integer file_time;
	 
	 private Timestamp  last_scan;
	 
	 
	 @Column(columnDefinition = "TEXT COLLATE utf8mb4_unicode_520_ci") 	
	 String meta = null;
}
