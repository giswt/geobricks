/**
 *
 * GeoBricks
 *
 * Copyright (c) 2011 by Kalimaha
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 *
 */
package org.geobricks.gdal.general;

/**
 * 
 * @author <a href="mailto:guido.barbaglia@gmail.com">Guido Barbaglia</a> 
 *
 */
public class FileResolution {

	private String xResolution;
	
	private String yResolution;
	
	public FileResolution(String xResolution, String yResolution) {
		super();
		this.setxResolution(xResolution);
		this.setyResolution(yResolution);
	}

	public String getxResolution() {
		return xResolution;
	}

	public void setxResolution(String xResolution) {
		this.xResolution = xResolution;
	}

	public String getyResolution() {
		return yResolution;
	}

	public void setyResolution(String yResolution) {
		this.yResolution = yResolution;
	}
	
	@Override
	public String toString() {
		return this.getxResolution() + " " + this.getyResolution();
	}
	
}