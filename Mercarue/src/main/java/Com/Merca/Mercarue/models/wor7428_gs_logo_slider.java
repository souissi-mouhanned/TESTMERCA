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
public class wor7428_gs_logo_slider {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	  private Long id;
	
	
	LocalDateTime 	 created_at ;
	 LocalDateTime updated_at ;
	 
	 @Column(columnDefinition = "LONGTEXT COLLATE utf8mb4_unicode_520_ci") 	
	 String shortcode_settings ;
	 
	 @Column(columnDefinition = "TEXT COLLATE utf8mb4_unicode_520_ci") 	
	 String shortcode_name ;
}
