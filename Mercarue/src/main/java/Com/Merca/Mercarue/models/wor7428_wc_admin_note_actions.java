package Com.Merca.Mercarue.models;


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
		
public class wor7428_wc_admin_note_actions {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	  @Column( columnDefinition = "bigint(20)")
	private Long action_id;
	
	 @Column( columnDefinition = "bigint(20)")
		private Long note_id;
	 

	 @Column(columnDefinition = "VARCHAR(255) COLLATE utf8mb4_unicode_520_ci")
	 String name ;
		
	 @Column(columnDefinition = "VARCHAR(255) COLLATE utf8mb4_unicode_520_ci")
	 String label ;
		
	 @Column(columnDefinition = "VARCHAR(255) COLLATE utf8mb4_unicode_520_ci")
	 String status ;
		
	 @Column(columnDefinition = "VARCHAR(255) COLLATE utf8mb4_unicode_520_ci")
	 String actioned_text ;
		
	 @Column(columnDefinition = "VARCHAR(255) COLLATE utf8mb4_unicode_520_ci")
	 String nonce_action ;
		
	 @Column(columnDefinition = "VARCHAR(255) COLLATE utf8mb4_unicode_520_ci")
	 String nonce_name ;
		
	 @Column(columnDefinition = "LONGTEXT COLLATE utf8mb4_unicode_520_ci")
	 String query ;
}
