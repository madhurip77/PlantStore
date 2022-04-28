package com.abc.db;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

// act like as ORM layer / Hibernate
@Component
public class PlantDatabase {
	
	Map<Integer, String> 		PlantDB = new HashMap<>();
	Map<String, String> PlantPoints = new HashMap<>();
}
	