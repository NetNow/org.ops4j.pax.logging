/*
 * Copyright 2005 Niclas Hedhman.
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
package org.ops4j.pax.logging.internal;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.Priority;
import org.ops4j.pax.logging.PaxLogger;

public class PaxLoggerImpl
    implements PaxLogger
{
    private org.apache.log4j.Logger m_delegate;

    public PaxLoggerImpl( Logger delegate )
    {
        m_delegate = delegate;
    }

    public boolean isTraceEnabled()
    {
        return m_delegate.isTraceEnabled();
    }

    public boolean isDebugEnabled()
    {
        return m_delegate.isDebugEnabled();
    }

    public boolean isWarnEnabled()
    {
        return m_delegate.isEnabledFor( Level.WARN );
    }

    public boolean isInfoEnabled()
    {
        return m_delegate.isInfoEnabled();
    }

    public boolean isErrorEnabled()
    {
        return m_delegate.isEnabledFor( Level.ERROR );
    }

    public boolean isFatalEnabled()
    {
        return m_delegate.isEnabledFor( Level.FATAL );
    }

    public void trace( String message, Throwable t )
    {
        m_delegate.trace( message, t );
    }

    public void debug( String message, Throwable t )
    {
        m_delegate.debug( message, t );
    }

    public void inform( String message, Throwable t )
    {
        m_delegate.info( message, t );
    }

    public void warn( String message, Throwable t )
    {
        m_delegate.warn( message, t );
    }

    public void error( String message, Throwable t )
    {
        m_delegate.error( message, t );
    }

    public void fatal( String message, Throwable t )
    {
        m_delegate.fatal( message, t );
    }

    public int getLogLevel()
    {
        return m_delegate.getLevel().toInt();
    }

    public void log( String callerFQCN, Priority level, Object message, Throwable t )
    {
        m_delegate.log( callerFQCN, level, message, t );
    }
}

