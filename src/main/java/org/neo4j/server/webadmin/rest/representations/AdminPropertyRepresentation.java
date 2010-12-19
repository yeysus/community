/**
 * Copyright (c) 2002-2010 "Neo Technology,"
 * Network Engine for Objects in Lund AB [http://neotechnology.com]
 *
 * This file is part of Neo4j.
 *
 * Neo4j is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */

package org.neo4j.server.webadmin.rest.representations;


import java.util.HashMap;
import java.util.Map;

import org.neo4j.server.rest.domain.Representation;

@Deprecated
public class AdminPropertyRepresentation implements Representation
{
	private final Map<String, Map<String, String>> value;
	private final String baseUri;

	public AdminPropertyRepresentation(String baseUri)
	{
		this.baseUri = baseUri;
		value = new HashMap<String, Map<String, String>>();
		value.put( baseUri, new HashMap<String, String>() );
	}

	public void addUrl(String name, String url)
	{
		value.get( baseUri ).put( name, url );
	}

	public Map<String, Map<String, String>> serialize()
	{
		return value;
	}
}
