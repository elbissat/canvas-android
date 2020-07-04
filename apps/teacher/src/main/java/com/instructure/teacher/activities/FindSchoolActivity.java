/*
 * Copyright (C) 2017 - present Instructure, Inc.
 *
 *     This program is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, version 3 of the License.
 *
 *     This program is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 */

package com.instructure.teacher.activities;

import android.content.Context;
import android.content.Intent;
import androidx.core.content.ContextCompat;

import com.instructure.canvasapi2.models.AccountDomain;
import com.instructure.canvasapi2.models.AccountDomainModel;
import com.instructure.loginapi.login.activities.BaseLoginFindSchoolActivity;
import com.instructure.teacher.R;

public class FindSchoolActivity extends BaseLoginFindSchoolActivity {

    @Override
    protected int themeColor() {
        return ContextCompat.getColor(this, R.color.login_teacherAppTheme);
    }

    @Override
    protected Intent signInActivityIntent(AccountDomainModel accountDomain) {
        return SignInActivity.createIntent(this, accountDomain);
    }

    public static Intent createIntent(Context context) {
        return new Intent(context, FindSchoolActivity.class);
    }
}
