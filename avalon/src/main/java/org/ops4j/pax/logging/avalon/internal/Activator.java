/*
 * Copyright 2006 Niclas Hedhman.
 *
 * Licensed  under the  Apache License,  Version 2.0  (the "License");
 * you may not use  this file  except in  compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed  under the  License is distributed on an "AS IS" BASIS,
 * WITHOUT  WARRANTIES OR CONDITIONS  OF ANY KIND, either  express  or
 * implied.
 *
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.ops4j.pax.logging.avalon.internal;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.apache.avalon.framework.logger.Logger;
import org.ops4j.pax.logging.avalon.AvalonLogFactory;

public class Activator
    implements BundleActivator
{

    public void start( BundleContext iContext )
        throws Exception
    {
        AvalonLogFactory.setBundleContext( iContext );
        String name = getClass().getName();
        Logger logger = AvalonLogFactory.getLogger( name );
        logger.info( "Enabling Avalon Logger API support." );
    }

    public void stop( BundleContext iContext )
        throws Exception
    {
        String name = getClass().getName();
        Logger logger = AvalonLogFactory.getLogger( name );
        logger.info( "Disabling Avalon Logger API support." );
        AvalonLogFactory.release();
    }
}