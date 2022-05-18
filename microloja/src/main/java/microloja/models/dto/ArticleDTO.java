package microloja.models.dto;

import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ArticleDTO {
	
	private	int					id;
	private	String				title;
	private	String				url;
	private	String				imageUrl;
	private	String 				newsSite;
	private	String 				summary;
	private	String				publishedAt;
	private	String				updatedAt;
	private	boolean				featured;
	private	List<LaunchesDTO>	launches;
	private	List<EventsDTO>		events;
}
