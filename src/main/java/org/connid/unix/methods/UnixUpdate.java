/*
 * ====================
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 *
 * Copyright 2011 Tirasa. All rights reserved.
 *
 * The contents of this file are subject to the terms of the Common Development
 * and Distribution License("CDDL") (the "License").  You may not use this file
 * except in compliance with the License.
 *
 * You can obtain a copy of the License at
 * http://IdentityConnectors.dev.java.net/legal/license.txt
 * See the License for the specific language governing
 * permissions and limitations under the License.
 *
 * When distributing the Covered Code, include this
 * CDDL Header Notice in each file
 * and include the License file at identityconnectors/legal/license.txt.
 * If applicable, add the following below this CDDL Header, with the fields
 * enclosed by brackets [] replaced by your own identifying information:
 * "Portions Copyrighted [year] [name of copyright owner]"
 * ====================
 */
package org.connid.unix.methods;

import java.io.IOException;
import java.util.Set;
import org.connid.unix.UnixConfiguration;
import org.connid.unix.UnixConnection;
import org.identityconnectors.common.logging.Log;
import org.identityconnectors.framework.common.exceptions.ConnectorException;
import org.identityconnectors.framework.common.objects.Attribute;
import org.identityconnectors.framework.common.objects.Uid;

public class UnixUpdate extends CommonMethods {

    private static final Log LOG = Log.getLog(UnixUpdate.class);
    private Set<Attribute> attrs = null;
    private UnixConfiguration configuration = null;
    private UnixConnection connection = null;
    private Uid uid = null;

    public UnixUpdate(final UnixConfiguration unixConfiguration,
            final Uid uid, final Set<Attribute> attrs) throws IOException {
        this.configuration = unixConfiguration;
        this.uid = uid;
        this.attrs = attrs;
        connection = UnixConnection.openConnection(configuration);
    }

    public Uid update() {
        try {
            return doUpdate();
        } catch (Exception e) {
            LOG.error(e, "error during update operation");
            throw new ConnectorException(e);
        }
    }

    private Uid doUpdate() {
        throw new UnsupportedOperationException("Not yet implemented");
    }
}