/*
 * Copyright 2002-2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.web.servlet.resource;

import org.springframework.core.io.Resource;


/**
 * Interface for a resource descriptor that describes the encoding
 * applied to the entire resource content.
 *
 * <p>This information is required if the client consuming that resource
 * needs additional decoding capabilities to retrieve the resource's content.
 *
 * @author Jeremy Grelle
 * @since 4.1
 * @see <a href="http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.11">RFC2616 HTTP Content-Encoding</a>
 */
public interface EncodedResource extends Resource {

	/**
	 * The content coding value, as defined in the IANA registry
	 * @return the content encoding
	 * @see <a href="http://www.w3.org/Protocols/rfc2616/rfc2616-sec3.html#sec3.5">RFC 2616 Content codings</a>
	 */
	public String getContentEncoding();

}
