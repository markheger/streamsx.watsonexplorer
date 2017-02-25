package com.ibm.streams.watsonexplorer;

public interface SearchResult {

	public String getContent();
	
	public boolean hasMore();
	
	public SearchResult next() throws Exception ;
	
}
