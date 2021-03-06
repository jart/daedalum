/*
 * Copyright 2010-2011 Stainless Code
 *
 *  This file is part of Daedalum.
 *
 *  Daedalum is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  Daedalum is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with Daedalum.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.stainlesscode.mediapipeline.videoout;

import java.awt.Graphics;
import java.awt.Graphics2D;

import com.stainlesscode.mediapipeline.VideoFilter;

@SuppressWarnings("serial")
public class FilterVideoPanel extends DefaultVideoPanel {

	protected VideoFilter filter;

	public FilterVideoPanel() {
		super();
	}

	public void paintComponent(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;

		if (currentFrame != null) {
			if (filter != null) {
				this.currentFrame = filter.applyFilter(this.currentFrame);
			}
		}

		super.paintComponent(g2d);
	}

	public VideoFilter getFilter() {
		return filter;
	}

	public void setFilter(VideoFilter filter) {
		this.filter = filter;
	}

}
