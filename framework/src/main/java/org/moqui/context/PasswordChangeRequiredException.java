/*
 * This software is in the public domain under CC0 1.0 Universal plus a
 * Grant of Patent License.
 *
 * To the extent possible under law, the author(s) have dedicated all
 * copyright and related and neighboring rights to this software to the
 * public domain worldwide. This software is distributed without any
 * warranty.
 *
 * You should have received a copy of the CC0 Public Domain Dedication
 * along with this software (see the LICENSE.md file). If not, see
 * <http://creativecommons.org/publicdomain/zero/1.0/>.
 */
package org.moqui.context;

import org.apache.shiro.authc.CredentialsException;

/** Thrown when user's password is correct but account requires second factor authentication. */
public class PasswordChangeRequiredException extends CredentialsException {
    public PasswordChangeRequiredException() { super(); }
    public PasswordChangeRequiredException(String str) { super(str); }
    public PasswordChangeRequiredException(Throwable nested) { super(nested); }
    public PasswordChangeRequiredException(String str, Throwable nested) { super(str, nested); }
}

