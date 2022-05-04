/*
 * Copyright (C) 2014 RoboVM AB
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/gpl-2.0.html>.
 */
package org.robovm.compiler.llvm;

import java.io.IOException;
import java.io.Writer;

/**
 *
 * @version $Id$
 */
public class MetadataType extends Type {
    
    MetadataType() {
    }
    
    @Override
    public String toString() {
        return "metadata";
    }

    @Override
    public void write(Writer writer) throws IOException {
        writer.write(toString());
    }
}
