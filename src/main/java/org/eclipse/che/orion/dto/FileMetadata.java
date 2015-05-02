/*******************************************************************************
 * Copyright (c) 2012-2015 Codenvy, S.A.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Codenvy, S.A. - initial API and implementation
 *******************************************************************************/
package org.eclipse.che.orion.dto;

import java.util.ArrayList;
import java.util.List;

public class FileMetadata {
    public FileAttributes Attributes;
    public List<FileMetadata> Children;
    public String ChildrenLocation;
    public boolean Directory;
    public List<String> FileEncoding = new ArrayList<String>();
    public String ImportLocation;
    public long Length;
    public long LocalTimeStamp;
    public String Location;
    public String Name;
    public List<FileParent> Parents = new ArrayList<FileMetadata.FileParent>();
    public String SearchLocation;

    public static class FileParent {
        public String ChildrenLocation;
        public String Location;
        public String Name;
    }

    public static class FileAttributes {
        public boolean Archive = true;
        public boolean Hidden;
        public boolean ReadOnly;
        public boolean SymLink;
    }
}
