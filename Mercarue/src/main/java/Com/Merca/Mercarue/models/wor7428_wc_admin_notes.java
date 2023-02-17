package Com.Merca.Mercarue.models;

import java.time.LocalDateTime;

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
public class wor7428_wc_admin_notes {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	  @Column( columnDefinition = "bigint(20)")
	private Long note_id;
	
	 @Column(columnDefinition = "VARCHAR(191) COLLATE utf8mb4_unicode_520_ci")
	 String name ;
		
	 @Column(columnDefinition = "VARCHAR(191) COLLATE utf8mb4_unicode_520_ci")
	 String type ;
		
	 @Column(columnDefinition = "VARCHAR(191) COLLATE utf8mb4_unicode_520_ci")
	 String locale ;
		
	 @Column(columnDefinition = "VARCHAR(191) COLLATE utf8mb4_unicode_520_ci")
	 String status ;
		
	 @Column(columnDefinition = "VARCHAR(191) COLLATE utf8mb4_unicode_520_ci")
	 String source ;
		
	 @Column(columnDefinition = "VARCHAR(191) COLLATE utf8mb4_unicode_520_ci")
	 String layout ;
		
	 @Column(columnDefinition = "VARCHAR(191) COLLATE utf8mb4_unicode_520_ci")
	 String image ;
		
	 @Column(columnDefinition = "VARCHAR(191) COLLATE utf8mb4_unicode_520_ci")
	 String icon ;
	 
	 @Column(columnDefinition = "LONGTEXT COLLATE utf8mb4_unicode_520_ci") 	
	 String title ;
	 
	 @Column(columnDefinition = "LONGTEXT COLLATE utf8mb4_unicode_520_ci") 	
	 String content ;
	 
	 @Column(columnDefinition = "LONGTEXT COLLATE utf8mb4_unicode_520_ci") 	
	 String content_data ;
	 

	 LocalDateTime date_created  ;
	 LocalDateTime date_reminder ;
	 
	  @Column(columnDefinition = "tinyint(1)")
	    private Boolean is_snoozable;
		 
	  @Column(columnDefinition = "tinyint(1)")
	    private Boolean is_deleted;
		 
	  @Column(columnDefinition = "tinyint(1)")
	    private Boolean is_read;
	 
	
	
	
}
